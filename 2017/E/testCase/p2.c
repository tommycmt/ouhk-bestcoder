#include <stdio.h>

int main() {
	int n, m, left, right, x, i;
	while (scanf("%d", &n) != EOF && n) {
		m = n>>1;
		left = right = 0;
		for (i = 0; i < m; i++) {
			scanf("%d", &x);
			left += x;
		}
		if ((n&1))
			scanf("%d", &x);
		for (i = 0; i < m; i++) {
			scanf("%d", &x);
			right += x;
		}
		if (left == right)
			printf("BALANCE\n");
		else if (left > right)
			printf("LEFT\n");
		else
			printf("RIGHT\n");
	}
	return 0;
}
