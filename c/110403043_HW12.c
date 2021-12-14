#include <stdio.h>
#include <stdlib.h>
int f(int n){
    if(n==0){
        return 3;
    }else{
        return 2*f(n-1)-5;
    }
}
int main(void){
    int n;
    printf("f(n) = 2f(n-1)-5; f(0)=3\n");
    do{
        printf("Please enter the positive interger n: ");
        scanf("%d",&n);
    }while(n<0);
    
    printf("%d\n",f(n));

    system("pause");
    return 0;
}