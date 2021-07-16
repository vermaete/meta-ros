# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A reverse ROS bridge for the MiR100 robot"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
HOMEPAGE = "https://github.com/dfki-ric/mir_robot"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & Apache 2.0"
LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mir_robot"
ROS_BPN = "mir_driver"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-websocket-client \
    actionlib-msgs \
    diagnostic-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    mir-actions \
    mir-msgs \
    move-base-msgs \
    nav-msgs \
    rosgraph-msgs \
    roslaunch \
    rospy \
    rospy-message-converter \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-websocket-client \
    actionlib-msgs \
    diagnostic-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    mir-actions \
    mir-msgs \
    move-base-msgs \
    nav-msgs \
    rosgraph-msgs \
    rospy \
    rospy-message-converter \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-websocket-client \
    actionlib-msgs \
    diagnostic-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    mir-actions \
    mir-description \
    mir-msgs \
    move-base-msgs \
    nav-msgs \
    robot-state-publisher \
    rosgraph-msgs \
    rospy \
    rospy-message-converter \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_driver/1.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mir_driver"
SRC_URI = "git://github.com/uos-gbp/mir_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "e56da0df6e865782d78ce7d43ef7102b345724c2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
