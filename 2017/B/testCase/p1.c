#include <stdio.h>
#include <string.h>

int main() {
	char line[10];
	int tmp, i;
	while (gets(line) != NULL) {
		if (strlen(line) == 3) {
			for (i = 0; i < 3; i++) {
				tmp = line[i] - '0';
				printf("%d%d%d", (tmp>>2)&1, (tmp>>1)&1, tmp&1);
			}
		} else {
			for (i = 0; i < 3; i++) {
				tmp = (line[3 * i] - '0') * 4;
				tmp += (line[3 * i + 1] - '0') * 2;
				tmp += (line[3 * i + 2] - '0');
				printf("%d",tmp);
			}
		}
		printf("\n");	
	}
	return 0;
}
