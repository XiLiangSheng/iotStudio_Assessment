#include <stdio.h>
void main()
{
	int i=0,j=0;
	printf("����������������\n");
	scanf("%d %d",&i,&j);
	int a,b,c,d;
	int a1[i][j]; 
	for(a=0;a<i;a++)
	for(b=0;b<j;b++)
	scanf("%d",&a1[a][b]);
        for(a=1;a<i;a++)
		 {
            for(b=1;b<j;b++) 
			{
                if(a1[a][b]!=a1[a-1][b-1])
				 {
                    c += 1;
               	 } 
				else
				 {
                    d += 1;
               	 }
            }
        }
    if (c > 0) 
	{
        printf("�Խ��ߵ�ֵ�����");
    } else 
	{
        printf("�Խ��ߵ�ֵ���");
    }	
}
