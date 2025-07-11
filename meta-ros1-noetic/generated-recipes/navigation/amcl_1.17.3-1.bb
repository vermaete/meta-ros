# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "<p>             amcl is a probabilistic localization system for a robot moving in             2D. It implements the adaptive (or KLD-sampling) Monte Carlo             localization approach (as described by Dieter Fox), which uses a             particle filter to track the pose of a robot against a known map.         </p>         <p>             This node is derived, with thanks, from Andrew Howard's excellent             'amcl' Player driver.         </p>"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Brian P. Gerkey"
HOMEPAGE = "http://wiki.ros.org/amcl"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=58d727014cda5ed405b7fb52666a1f97"

ROS_CN = "navigation"
ROS_BPN = "amcl"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    map-server \
    python3-pykdl \
    rostest \
    tf2-py \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/noetic/amcl/1.17.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/amcl"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "fd30e7aad0e5e3fac55ca6b89fdc6cd4955ed951"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
