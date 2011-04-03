package net.egork.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Egor Kulikov (kulikov@devexperts.com)
 */
public class TaskList extends AnAction {
	private final Set<Presentation> presentations = new HashSet<Presentation>();
	private final Set<Component> components = new HashSet<Component>();

	@Override
	public boolean displayTextInToolbar() {
		return true;
	}

	@Override
	public void update(AnActionEvent e) {
		TaskConfiguration currentTask = ConfigurationHolder.getInstance().getCurrentTask();
		presentations.add(e.getPresentation());
		if (e.getInputEvent() != null && e.getInputEvent().getComponent() != null) {
			components.add(e.getInputEvent().getComponent());
		}
		update(currentTask);
	}

	@Override
	public void actionPerformed(AnActionEvent e) {
		TaskConfiguration selected = SelectTaskDialog.selectTask(e.getInputEvent().getComponent());
		ConfigurationHolder.getInstance().setCurrentTask(selected);
		components.add(e.getInputEvent().getComponent());
	}

	@Override
	public boolean isTransparentUpdate() {
		return true;
	}

	public void update(TaskConfiguration currentTask) {
		for (Presentation presentation : presentations) {
			presentation.setText("");
			presentation.setText(currentTask == null ? "No task" : currentTask.getTaskID());
			presentation.setEnabled(Util.getProject() != null && currentTask != null);
		}
		for (Component component : components) {
			if (component.isDisplayable())
				component.repaint();
			else
				components.remove(component);
		}
	}
}
