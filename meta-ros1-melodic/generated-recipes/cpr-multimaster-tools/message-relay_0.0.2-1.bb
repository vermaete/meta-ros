# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Package to programmatically spawn message, service, and action relays. To add support for a message/service dependency, please add to the build dependencies in package.xml and CMakeLists.txt"
AUTHOR = "Paul Bovbel <pbovbel@clearpath.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cpr_multimaster_tools"
ROS_BPN = "message_relay"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-cheetah \
    actionlib-msgs \
    controller-manager-msgs \
    diagnostic-msgs \
    gazebo-msgs \
    geometry-msgs \
    map-msgs \
    move-base-msgs \
    multimaster-msgs \
    nav-msgs \
    robot-localization \
    roscpp \
    rosgraph-msgs \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    controller-manager-msgs \
    diagnostic-msgs \
    gazebo-msgs \
    geometry-msgs \
    map-msgs \
    move-base-msgs \
    multimaster-msgs \
    nav-msgs \
    robot-localization \
    roscpp \
    rosgraph-msgs \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    controller-manager-msgs \
    diagnostic-msgs \
    gazebo-msgs \
    geometry-msgs \
    map-msgs \
    move-base-msgs \
    multimaster-msgs \
    nav-msgs \
    robot-localization \
    roscpp \
    rosgraph-msgs \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/message_relay/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/message_relay"
SRC_URI = "git://github.com/clearpath-gbp/cpr_multimaster_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "eeaacfe61cbe6bc6abc0b4872414896d69e09eb5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
