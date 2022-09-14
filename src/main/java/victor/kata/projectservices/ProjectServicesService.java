package victor.kata.projectservices;

import java.util.List;

public interface ProjectServicesService {
   List<ProjectServices> getProjectServicesByProjectId(Long id);
   ProjectServices findByServiceAndProject(Service service, Project project);
}
