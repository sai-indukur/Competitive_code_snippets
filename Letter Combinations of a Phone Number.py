#17. Letter Combinations of a Phone Number
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        d={}
        lst=[]
        if len(digits)==0:return lst
    
        d['2']='abc'
        d['3']='def'
        d['4']='ghi'
        d['5']='jkl'
        d['6']='mno'
        d['7']='pqrs'
        d['8']='tuv'
        d['9']='wxyz'
        
        def combination(ans,digits,i,lst):
            if(i>=len(digits)):
                lst.append(ans)
                return
            
            tmp=d[digits[i]]
            for k in tmp:
                combination(ans+k,digits,i+1,lst)
        combination("",digits,0,lst)
        return lst
    
             
            
        
