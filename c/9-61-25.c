#include <stdio.h>
#include <stdlib.h>
void tolower(char s[]){
    int i=0;
    while(s[i]!='\0'){
        if(s[i]>=65 && s[i]<=90){
            s[i]=s[i]+32;
        }
        i++;
    }
}
int main(void){
    char str[15];
    printf("輸入一個字串");
    gets(str);
    tolower(str);
    printf("%s\n",str);
    
    system("pause");
    return 0;
}