#13 Roman to Integer LeetCode
class Solution:
    def romanToInt(self, s: str) -> int:
        d={}
       
        d['I']=1
        d['V']=5
        d['X']=10
        d['L']=50
        d['C']=100
        d['D']=500
        d['M']=1000
        sum=d[s[len(s)-1]]
        for i in range(len(s)-2,-1,-1):
            if(d[s[i]]<d[s[i+1]]):
                sum=sum-d[s[i]]
            else:
                sum=sum+d[s[i]]
                
        return sum
            
            
            
            
        
        
