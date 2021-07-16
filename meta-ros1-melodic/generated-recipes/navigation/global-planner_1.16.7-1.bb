# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A path planner library and node."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "David Lu!!"
HOMEPAGE = "http://wiki.ros.org/global_planner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation"
ROS_BPN = "global_planner"

ROS_BUILD_DEPENDS = " \
    angles \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    nav-core \
    nav-msgs \
    navfn \
    pluginlib \
    roscpp \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    nav-core \
    nav-msgs \
    navfn \
    pluginlib \
    roscpp \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    nav-core \
    nav-msgs \
    navfn \
    pluginlib \
    roscpp \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/melodic/global_planner/1.16.7-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/global_planner"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "4a19351791b79a58e94d45704afbaec88461846d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
