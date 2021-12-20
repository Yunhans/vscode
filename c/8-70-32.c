#include <stdio.h>
#include <stdlib.h>
# define CUBIC(x) x*x*x
int main(void){
    int x;
    printf("enter a number: ");
    scanf("%d",&x);
    printf("%d",CUBIC(x));
    system("pause");
    return 0;
}