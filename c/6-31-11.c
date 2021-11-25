#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    float hour;
    printf("Wages calculater\nEnter your total working hours this month : ");
    scanf("%f",&hour);

    if(hour<0){
        printf("You must typed the wrong hour\n");
    }else if(hour==0){
        printf("You lazy guy, there's no money for you\n");
    }else if(hour<=60){
        printf("Your salaries this month are %.1f dollars\n",hour*60);
    }else if(hour>60 && hour<=75){
        printf("Your salaries this month are %.1f dollars\n",75*60+(hour-60)*75*1.25);
    }else{
        printf("Your salaries this month are %.1f dollars\n",75*60+15*75*1.25+(hour-75)*75*1.75);
    }
    
    system("pause");
    return 0;
}