//C program to replace all vowels with star (*) and consonants with hash (#) of string.
#include <stdio.h>
int main(){
     char str[200];
    int i;
    printf(" Enter any string: ");
    scanf("%[^\n]s",str);
    for(i=0;str[i]!='\0';i++){
        printf("%c",str[i]);
    }
    for(i=0;str[i]!='\0';i++){
        if(str[i]>='A'&&str[i]<='Z'||str[i]>='a'&&str[i]<='z'){
            if(str[i]=='A' || str[i]=='a' || str[i]=='e'|| str[i]=='E' || str[i]=='I' || str[i]=='i' ||str[i]=='o' || str[i]=='O' || str[i]=='U' || str[i]=='u'){
            str[i]='*';
             }else{
                 str[i]='#';
             }
    }
    }
    printf("String: %s\n",str);
    return 0;
}