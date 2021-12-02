#include <stdio.h>
#include <stdlib.h>
int main(void){
    int a,b,i,j;
    do{
        printf("輸入一個正整數:");
        scanf("%d",&a);
    }while(a<=0);
    for(b=a-1;b>0;b--){
        for(i=b,j=0;i>=1;i--){
            if(b%i==0){
                j++;
            }
        }
        if(j==2){
            break;
        }
    }
    if(b!=0){
        printf("小於%d的最大質數為%d",a,b);
    }else{
        printf("沒有比%d更小的質數了",a);
    }
    system("pause");
    return 0;
}