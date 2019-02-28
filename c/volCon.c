//C program to print all VOWEL and CONSONANT characters separately.
#include <stdio.h>
#define k 50
int main(){
    char str[k];
    int i;
    printf(" Enter any string: ");
    scanf("%[^\n]s",str);
    for(i=0;str[i]!='\0';i++){
        printf("%c",str[i]);
    }
    printf("\nVowels: ");
    for(i=0;str[i]!='\0';i++){
        if(str[i]=='A' || str[i]=='a' || str[i]=='e'|| str[i]=='E' || str[i]=='I' || str[i]=='i' ||str[i]=='o' || str[i]=='O' || str[i]=='U' || str[i]=='u'){
            printf("%c",str[i]);
        }
    }
    printf("\nConsonant: ");
    for(i=0;str[i]!='\0';i++){
        if(!(str[i]=='A' || str[i]=='a' || str[i]=='e'|| str[i]=='E' || str[i]=='I' || str[i]=='i' ||str[i]=='o' || str[i]=='O' || str[i]=='U' || str[i]=='u')){
            printf("%c",str[i]);
        }
    }
    printf("\n");
    return 0;
}