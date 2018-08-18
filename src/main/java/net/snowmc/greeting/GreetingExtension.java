package net.snowmc.greeting;

import org.gradle.api.tasks.Input;

public class GreetingExtension
{
    private String target = "Gradle";
    private String message = "Hello";

    @Input
    public String getTarget()
    {
        return target;
    }

    public void setTarget(String target)
    {
        this.target = target;
    }

    @Input
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
