class Problem217:
    # @param {integer[]} nums
    # @return {boolean}
    def containsDuplicate(self, nums):
        out = {}
        for val in nums:
            if out.get(val) is None:
                out[val] = 1
            else:
                return True
        return False