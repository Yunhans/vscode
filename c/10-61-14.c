#include <stdio.h>
#include <stdlib.h>
int main(void){
    int arr[5]={34,76,33,42,76};
    for(int i=0;i<5;i++){
        printf("arr[%d]=%d\n",i+1,*(arr+i));
    }
    printf("\nafter add 10\n\n");
    for(int i=0;i<5;i++){
        printf("arr[%d]=%d\n",i+1,*(arr+i)+10);
    }
    system("pause");
    return 0;
}