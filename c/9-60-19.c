#include <stdio.h>
#include <stdlib.h>
#define SIZE 4
void square(int arr[]){
    int i;
    for(i=0;i<SIZE;i++){
        arr[i]*=arr[i];
    }
}
void show(int arr[]){
    int i;
    for(i=0;i<SIZE;i++){
        printf(" %d",arr[i]);
    }
    printf("\n");
}
int main(void){
    int A[SIZE] = {3,4,5,6};
    show(A);
    square(A);
    show(A);
    
    system("pause");
    return 0;
}