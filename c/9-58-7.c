#include <stdio.h>
#include <stdlib.h>
int main(void){
    int i;
    float f[5],sum=0;
    for(i=0;i<5;i++){
        printf("please enter a number:");
        scanf("%f",&f[i]);
        sum+=f[i];
    }
    printf("%f\n",sum/5);
    
    system("pause");
    return 0;
}