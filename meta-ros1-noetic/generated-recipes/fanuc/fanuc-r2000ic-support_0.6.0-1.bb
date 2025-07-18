# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "<p>       ROS-Industrial support for the Fanuc R-2000iC (and variants).     </p>     <p>       This package contains configuration data, 3D models and launch files       for Fanuc R-2000iC manipulators. This includes the /125L, /165F, /210F,       /210L and /270F variants.     </p>     <p>       <b>Note</b>: for use with current ROS packages, the /210F is identical       to the /165F and reuses the meshes, kinematic structure and the OPW       parameters of the /165. Only the joint limits are different.     </p>     <p><b>Specifications</b>:</p>     <ul>       <li>R-2000iC/125L - &quot;Conventional dress-out&quot;</li>       <li>R-2000iC/165F - &quot;Conventional dress-out&quot;</li>       <li>R-2000iC/210F - &quot;Conventional dress-out&quot;</li>       <li>R-2000iC/210L - &quot;Conventional dress-out&quot;</li>       <li>R-2000iC/270F - &quot;Conventional dress-out&quot;</li>     </ul>     <p>       Joint limits and maximum joint velocities are based on the information in       the <em>FANUC Robot R-2000iC Mechanical Unit Operator's Manual</em>       version <em>B-83644EN/01</em>. All urdfs are based on the default motion       and joint velocity limits, unless noted otherwise (ie: no support for       high speed joints, extended / limited motion ranges or other options).     </p>     <p>       Before using any of the configuration files and / or meshes included       in this package, be sure to check they are correct for the particular       robot model and configuration you intend to use them with.     </p>     <p><b>Contributors</b>:</p>     <p>       This support package has received contributions from: Timo Birnkraut and       Simon Schmeisser (125L), Didier Quirin (210F), Haris Suwignyo (Alten       Nederland) (270F) and Ademola Oridate (Wilder Systems) (210L).     </p>"
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute) <g.a.vanderhoorn@tudelft.nl>"
ROS_AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute)"
HOMEPAGE = "http://wiki.ros.org/fanuc_r2000ic_support"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=49;endline=49;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fanuc"
ROS_BPN = "fanuc_r2000ic_support"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fanuc-driver \
    fanuc-resources \
    industrial-robot-client \
    joint-state-publisher-gui \
    robot-state-publisher \
    rviz \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/fanuc-release/archive/release/noetic/fanuc_r2000ic_support/0.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fanuc_r2000ic_support"
SRC_URI = "git://github.com/ros-industrial-release/fanuc-release;${ROS_BRANCH};protocol=https"
SRCREV = "c8b02a917231d9cecc440f8bce9f010cdd869459"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
