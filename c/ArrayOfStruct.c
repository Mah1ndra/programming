//Array of struct
#include <stdio.h>
struct st{
    int a;
    char b;
};
int main(){
    struct st st_arr[3];
    struct st st_obj0;
    st_obj0.a=0;
    st_obj0.b='a';

    struct st st_obj1;
    st_obj1.a=1;
    st_obj1.b='b';

    struct st st_obj2;
    st_obj2.a=3;
    st_obj2.b='c';

    st_arr[0] = st_obj0;
    st_arr[1] = st_obj1;
    st_arr[2] = st_obj2;

    printf("\n First elemetns of an arry has values a=[%d] and b=[%c]\n",st_arr[0].a,st_arr[0].b);
    printf("\n second elemetns of an arry has values a=[%d] and b=[%c]\n",st_arr[1].a,st_arr[1].b);
    printf("\n Third elemetns of an arry has values a=[%d] and b=[%c]\n",st_arr[2].a,st_arr[2].b);
    
    return 0;
}