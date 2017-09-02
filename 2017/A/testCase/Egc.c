#include <stdio.h>
#include <string.h>

char buf[1000];
char couldbe[20];


main(){
   memset(couldbe,1,sizeof(couldbe));
   while (gets(buf) && strcmp(buf,"0")) {
      int i, n = atoi(buf);
      gets(buf);
      if (!strcmp(buf,"too high")) {
         for (i=n;i<=10;i++) couldbe[i] = 0;
      } else if (!strcmp(buf,"too low")) {
         for (i=1;i<=n;i++) couldbe[i] = 0;
      } else {
         if (couldbe[n]) printf("Gino might be honest\n");
         else printf("Gino is a gino\n");
         memset(couldbe,1,sizeof(couldbe));
      }
   }
   if (strcmp(buf,"0")) printf("missing input terminator\n");
}
