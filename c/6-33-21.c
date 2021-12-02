#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    char input;
    printf("Please enter a character: ");
    scanf("%c",&input);

    switch(input){
        case 'a':
        case 'A':
            printf("You typed A\n");
            break;
        case 'b':
        case 'B':
            printf("You typed B\n");
            break;
        default:
            printf("You didn't enter A or B\n");
    }

    system("pause");
    return 0;
}