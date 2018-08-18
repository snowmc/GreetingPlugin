package net.snowmc.greeting;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPlugin implements Plugin<Project>
{
    @Override
    public void apply(Project project)
    {
        GreetingExtension ext = project.getExtensions().create("greeting", GreetingExtension.class);

        project.task("greet").doLast(task -> {
            System.out.println(ext.getMessage() + " " + ext.getTarget());
        });
    }
}
