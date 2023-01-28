public class LineSegment {
private final Point p;
private final Point q;

public LineSegment(Point p, Point q) {
    if (p != null && q != null) {
        if (p.equals(q)) {
            throw new IllegalArgumentException("both arguments to LineSegment constructor are the same point: " + p);
        } else {
            this.p = p;
            this.q = q;
        }
    } else {
        throw new IllegalArgumentException("argument to LineSegment constructor is null");
    }
}

public void draw() {
    this.p.drawTo(this.q);
}

public String toString() {
    return this.p + " -> " + this.q;
}

public int hashCode() {
    throw new UnsupportedOperationException("hashCode() is not supported");
}
}
