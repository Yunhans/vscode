#include <stdio.h>
#include <stdlib.h>
int add10(int *ptr){
    for(int i=0;i<5;i++){
        *(ptr+i)=*(ptr+i)+10;
    }
}
int main(void){
    int arr[5]={31,17,33,22,16};
    int *ptr=arr;
    for(int i=0;i<5;i++){
        printf("arr[%d]=%d\n",i,*(arr+i));
    }
    printf("add 10\n");
    *ptr = add10(arr);
    for(int i=0;i<5;i++){
        printf("arr[%d]=%d\n",i,*(arr+i));
    }
    system("pause");
    return 0;
}