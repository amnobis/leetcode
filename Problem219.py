class Problem219:
    # @param {integer[]} nums
    # @param {integer} k
    # @return {boolean}
    def containsNearbyDuplicate(self, nums, k):
        chk = {}
        for i in range(len(nums)):
            val = nums[i]
            if chk.get(val) is None:
                chk[val] = [i]
            else:
                tmp = chk[val]
                if i - tmp[-1] <= k:
                    return True
                else:
                    tmp.append(i)
                    chk[val] = tmp
        return False