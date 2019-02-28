//C program to convert string in upper case and lower case.
#include <stdio.h>
int main(){
    char str[40];
    int i;
    printf("Enter any String: ");
    scanf("%[^\n]s",str);
    printf("\nEntered String: %s",str);

   
    for(i=0;str[i]!='\0';i++){
        if(str[i]>='A'&&str[i]<='Z'){
            str[i] = str[i]+32;
        }
    }
     printf("\nLowerCase: %s",str);
     for(i=0;str[i]!='\0';i++){
        if(str[i]>='a'&&str[i]<='z'){
            str[i] = str[i]-32;
        }
    }
    printf("\nUppercase: %s\n",str);
    return 0;
}