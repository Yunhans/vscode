#include <stdio.h>
#include <stdlib.h>
int main(void){
    int a,j,i;
    printf("輸入一個整數:");
    scanf("%d",&a);
    for(i=a,j=0;i>=1;i--){
        if(a%i==0){
            j++;
        }
    }
    if(j==2){
        printf("此數是質數");
    }else{
        printf("此數不是質數");
    }
    system("pause");
    return 0;
}