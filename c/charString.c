//C program to print string one by one characters using loop.
#include <stdio.h>
#define s 50
int main(){
    char str[s];
    int i;
    printf("Enter any String: \n");
    scanf("%[^\n]s",str);
    printf("Entered String: ");
    for(i=0;str[i]!='\0';i++){
        printf("%c",str[i]);
    }
    printf("\n");
    return 0;
}  