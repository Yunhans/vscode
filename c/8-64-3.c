#include <stdio.h>
#include <stdlib.h>
int cub(int x){
    int a;
    a = x*x*x;
    return a;
}
int main(void){
    int a;
    printf("enter a number:");
    scanf("%d",&a);
    printf("%d\n",cub(a));
    system("pause");
    return 0;
}