//C program to find occurrence of a character in the string.
#include <stdio.h>
int main(){
    char str[100];
    char ch;
    int count=0,i;
    printf("Enter any String: ");
    scanf("%[^\n]s",str);
    printf("\nEnter any char: ");
    scanf("%c",&ch);
    printf("\nEntered String: %s",str);
    for(i=0;str[i]!='\0';i++){
        if(str[i]==ch){
            count++;
        }
    }
    printf("\n%c occured: %d\n",ch,count);
    return 0;
}