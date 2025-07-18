# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A daemon node to manage ROS launch files and launch nodes from loaded files."
AUTHOR = "Alexander Tiderko <alexander.tiderko@gmail.com>"
ROS_AUTHOR = "Alexander Tiderko"
HOMEPAGE = "https://github.com/fkie/multimaster_fkie"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fkie_multimaster"
ROS_BPN = "fkie_node_manager_daemon"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    fkie-multimaster-msgs \
    roslaunch \
    rospy \
    screen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    screen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    fkie-master-discovery \
    fkie-multimaster-msgs \
    python3-grpcio \
    python3-grpcio-tools \
    python3-psutil \
    python3-rospkg \
    python3-ruamel-yaml \
    roslaunch \
    rospy \
    screen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fkie-release/multimaster_fkie-release/archive/release/noetic/fkie_node_manager_daemon/1.3.2-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fkie_node_manager_daemon"
SRC_URI = "git://github.com/fkie-release/multimaster_fkie-release;${ROS_BRANCH};protocol=https"
SRCREV = "1df97850db5172ac915c52cd6fc3bc2a38b850dd"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
