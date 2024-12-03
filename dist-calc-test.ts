interface Point {
    x: number;
    y: number;
}

class Rectangle {
    private width: number;
    private height: number;

    constructor(width: number, height: number) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of a shape by multiplying its width and height.
     * 
     * @returns {number} The calculated area of the shape.
     */
    getArea(): number {
        
        return this.width * this.height;
    }

    resize(newWidth: number, newHeight: number): void {
        this.width = newWidth;
        this.height = newHeight;
    }
}

function calculateDistance(point1: Point, point2: Point): number {
    const dx = point1.x - point2.x;
    const dy = point1.y - point2.y;
    return Math.sqrt(dx * dx + dy * dy);
}
