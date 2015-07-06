class Problem204:
    # @param {integer} n
    # @return {integer}
    def countPrimes(self, n):
        if n <= 2:
            return 0
        
        primes = [True for i in range(n)]
        primes[0] = False
        primes[1] = False
        
        i = 2
        while i*i < n:
            if primes[i]:
                for j in range(i+i, n, i):
                    primes[j] = False
            i += 1
        
        count = 0
        for i in range(2, n):
            if primes[i]:
                count += 1
        
        return count
    