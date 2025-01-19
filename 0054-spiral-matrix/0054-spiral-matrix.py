class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        l=[]
        rowlower=0
        rowupper=len(matrix)-1
        collower=0
        colupper=len(matrix[0])-1
        print(rowupper,colupper)
        while (rowlower<=rowupper and collower<=colupper):
            for i in range(collower,colupper+1):
                 l.append(matrix[rowlower][i])
            rowlower+=1
            for i in range(rowlower,rowupper+1):
                l.append(matrix[i][colupper])
            colupper-=1
            if(rowlower>rowupper or collower>colupper):
                break
            for i in range(colupper,collower-1,-1):
                l.append(matrix[rowupper][i])
            rowupper-=1
            for i in range(rowupper,rowlower-1,-1):
                l.append(matrix[i][collower])
            collower+=1
        return l
        