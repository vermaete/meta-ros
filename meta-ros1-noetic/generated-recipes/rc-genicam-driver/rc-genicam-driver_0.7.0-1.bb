# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The rc_genicam_driver provides data from a Roboception rc_visard 3D sensor or rc_cube on several ROS topics."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "http://wiki.ros.org/rc_visard_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_genicam_driver"
ROS_BPN = "rc_genicam_driver"

ROS_BUILD_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    message-generation \
    nodelet \
    protobuf \
    rc-common-msgs \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    stereo-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    nodelet \
    rc-common-msgs \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    stereo-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    message-runtime \
    nodelet \
    protobuf \
    rc-common-msgs \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    stereo-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_genicam_driver_ros-release/archive/release/noetic/rc_genicam_driver/0.7.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rc_genicam_driver"
SRC_URI = "git://github.com/roboception-gbp/rc_genicam_driver_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "88d9f784fe6afa083b4cbf4c90723849ff0390cd"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
