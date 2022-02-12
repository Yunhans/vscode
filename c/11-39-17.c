#include <stdio.h>
#include <stdlib.h>

struct data{
    char name[10];
    int math;
} student[5];

struct data best(struct data student[]){
    int i;
    struct data best =  student[0];
    for(i=0;i<5;i++){
        if(best.math<student[i].math)
            best = student[i];
    }
    return best;
}

void failed(struct data student[]){
    int i;
    for(i=0;i<5;i++){
        if(student[i].math<60){
            printf("%s failed, score %d.\n",student[i].name,student[i].math);
        }  
    }
}

void sort(struct data student[]){
    int i,j;
    struct data sort;
    for(i=0,j=0;i<5;i++,j++){
        
    }
}

int main(void){
    int i;
    for(i=0;i<5;i++){
        printf("Enter student's name: ");
        gets(student[i].name);
        printf("Enter student's math score: ");
        scanf("%d",&student[i].math);
        fflush(stdin);
    }

    for(i=0;i<5;i++){
        printf("%s has the score %d.\n",student[i].name,student[i].math);
    }

    printf("Student %s has the highest score %d.\n",best(student).name,best(student).math);
    failed(student);

    system("pause");
    return 0;
}
