#include <stdio.h>
#include <stdlib.h>
int main(void){
    int sale[2][4]={
        {30,35,26,32},
        {33,34,30,29}
    };

    int j,suma=0,sumb=0;

    for(j=0;j<4;j++){
        suma+=sale[0][j];
        sumb+=sale[1][j];
    }    

    printf("%d\n",suma);
    printf("%d\n",sumb);

    system("pause");
    return 0;
}