package Hydro.util.animations;

import Hydro.util.Timer;

public abstract class Animation {

    public Timer timer = new Timer();
    protected int duration;
    protected double maxOutput;
    protected Enum<Direction> direction;

    public Animation(int ms, double endPoint) {
        this.duration = ms;
        this.maxOutput = endPoint;
        this.direction = Direction.FORWARDS;
    }

    public Animation(int ms, double maxOutput, Enum<Direction> direction) {
        this.duration = ms; //Time in milliseconds of how long you want the animation to take.
        this.maxOutput = maxOutput; //The desired distance for the animated object to go.
        this.direction = direction; //Direction in which the graph is going. If backwards, will start from endPoint and go to 0.
    }

    public void reset() {
        timer.reset();
    }

    public boolean isDone() {
        return timer.hasTimeElapsed(duration, false);
    }

    public void changeDirection() {
        if (direction == Direction.FORWARDS) {
            direction = Direction.BACKWARDS;
        } else {
            direction = Direction.FORWARDS;
        }
        timer.setTime(System.currentTimeMillis() - (duration - Math.min(duration, timer.getTime())));
    }

    public Enum<Direction> getDirection() {
        return direction;
    }

    public void setDirection(Enum<Direction> direction) {
        if (this.direction != direction) {
            timer.setTime(System.currentTimeMillis() - (duration - Math.min(duration, timer.getTime())));
            this.direction = direction;
        }
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getOutput() {
        if (direction == Direction.FORWARDS) {
            if (isDone())
                return maxOutput;
            return getEquation(timer.getTime()) * maxOutput;
        } else {
            if (isDone())
                return 0;
            return (1 - getEquation(timer.getTime())) * maxOutput;
        }
    }

    //This is where the animation equation should go, for example, a logistic function. Output should range from 0 - 1.
    //This will take the timer's time as an input, x.
    protected abstract double getEquation(double x);

}

