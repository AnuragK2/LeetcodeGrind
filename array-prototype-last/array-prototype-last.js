Array.prototype.last = function() {
    let x=-1
    if(this.length===0)
        return x;
    return this[this.length-1];    
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */