	#include <stdio.h>
	#include <string.h>
	void main()
	{
		int i,j,r;
		printf("输入单词或字母的长度\n");
		scanf("%d",&r);
		getchar();
		char c[r];
		printf("输入英文单词或字母\n"); 
		for(i=0;i<r;i++)
		{
			scanf("%c",&c[i]);
		}
		char b1[26]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','n','w','x','y','z'};
		char b2 [26]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char str[26][5] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		for(i=0;i<r;i++)
		{
			for(j=0;j<26;j++)
			{
				if(c[i]==b2[j]||c[i]==b1[j])
				{
					printf("%s ", str[j]); 
					break;
				}
			}
		}
}

