#include<stdio.h>
int main()
{
  int n=365,rem,q;
  scanf("%d",&n);
  q=365/4;
  rem=365%4;
  printf("Quotient: %d\nRemainder: %d",q,rem);
}