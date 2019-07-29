#include<stdio.h>
int main()
{
  int n=786,l,f,d;
 scanf("%d",&n);
  l=n%10;
  f=n/100;
  d=l+f;
  printf("%d",d);
    
  return 0;
}