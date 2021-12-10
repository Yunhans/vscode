#include <stdio.h>
#include <stdlib.h>
int is_prime(int num){
    int i;
    for(i=2;i<=num-1;i++){
        if(num%i==0){
            return 0;
        }
    }
    return 1;
}
int main(void){
    int i,j;
    for(i=2,j=0;j<100;i++){
        if(is_prime(i)){
            j++;
        }
    }
    printf("%d",i);
    system("pause");
    return 0;
}