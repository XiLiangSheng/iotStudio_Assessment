#include <stdio.h>
void main()
{	
	int i=0,j=0;
	printf("����������������\n");
	scanf("%d %d",&i,&j);
	int a,b;
	int a1[i][j];
	printf("����λ����1��ʾ\n");
	for(a=0;a<i;a++)
	for(b=0;b<j;b++)
	scanf("%d",&a1[a][b]);
	int a2[i][j];
	for(a=0;a<i;a++)
		for	(b=0;b<j;b++)
		a2[a][b]=0;
	int r=0;
	int r1=0;
	for(a=0;a<i;a++)	
	{	
		for(b=0;b<j;b++)
		{
			if(a1[a][b]==1)
			{
				for(r1=0;r1<j;r1++)
				{
					a2[a][r1]=1;
					a2[r1][b]=1;
				}
			}
		}
	}
	printf("�ж���\n");
	for(a=0;a<i;a++)	
	{	
		for(b=0;b<j;b++)
			{
				printf("%d ",a2[a][b]);
			}
		printf("\n");
	}
}
