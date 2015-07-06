class Problem205:
    # @param {string} s
    # @param {string} t
    # @return {boolean}
    def isIsomorphic(self, s, t):
        s_map = {}
        t_map = {}
        for i in range(len(s)):           
            if s_map.get(s[i]) is None:
                s_map[s[i]] = len(s_map)
            
            if t_map.get(t[i]) is None:
                t_map[t[i]] = len(t_map)
              
            if s_map[s[i]] != t_map[t[i]]:
                return False
        
        return True