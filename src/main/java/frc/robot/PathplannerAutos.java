public final class PathplannerAutos {

    private static final Map<String, Command> eventMap = new HashMap<>(Map.ofEntries(

      Map.entry("Stop", new InstantCommand(RobotContainer.m_drivetrain::stopSwerve)),
           
    ));
  
    private static final autoBuilder = new RamseteAutoBuilder(
            RobotContainer.m_drivetrain::getPose,
            RobotContainer.m_drivetrain::resetOdometry,
            Constants.AUTO_TRANSLATION_CONSTANTS,
            Constants.AUTO_ROTATION_CONSTANTS,
            RobotContainer.m_drivetrain::setChassisSpeeds,
            eventMap,
            true,
            RobotContainer.m_drivetrain
    );
  
    public static CommandBase none() {
      return Commands.none();
    }
  
    public static CommandBase ThreeLowCable() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("3-Low-Cable", new PathConstraints(4, 3)));
  
    }
  
    public static CommandBase ThreeLowNonCable() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("3-Low-No-Cable", new PathConstraints(4, 3)));
  
    }
  
    public static CommandBase TwoHighParkNoCable() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("2-Gamepiece-Park-No-Cable", new PathConstraints(3.5, 3)));
  
    }
  
    public static CommandBase TwoHighParkCable() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("2-Gamepiece-Park-Cable", new PathConstraints(3.5, 3)));
  
    }
  
    public static CommandBase TWoGamepieceCable() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("2-Gamepiece-Cable", new PathConstraints(3.5, 3)));
  
    }
  
    public static CommandBase TwoGamepieceNonCable() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("2-Gamepiece-No-Cable", new PathConstraints(2.5, 3)));
    }
  
    public static CommandBase PreloadParkCone() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("Preload-Park-Cone", new PathConstraints(1, 1)));
  
    }
  
    public static CommandBase TWOPARKNOCABLE() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("2+PARKNOCABLE", new PathConstraints(3.5, 3)));
  
    }
  
    public static CommandBase TWOPARKCABLE() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("2+PARKCABLE", new PathConstraints(3.5, 3)));
  
    }
  
    public static CommandBase PARKCENTER() {
  
      return autoBuilder.fullAuto(PathPlanner.loadPathGroup("1+PARKCENTER", new PathConstraints(1, 1)));
  
    }
  
    private Auto() {
      throw new UnsupportedOperationException("This is a utility class!");
    }
  
  }