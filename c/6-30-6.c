#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int height,weight;
    printf("Please enter your weight:");
    scanf("%d",&weight);
    printf("Please enter your height:");
    scanf("%d",&height);

    if(weight>90 && height<180)
        printf("Over weight");
    else
        printf("Not over weight");
    
    system("pause");
    return 0;
}