# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "API and ROS drivers for Phidgets devices"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Phidgets Inc."
HOMEPAGE = "http://ros.org/wiki/phidgets_drivers"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD, LGPL"
LICENSE = "BSD-&-LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=9b8b2c2c843b0cb5803c38944da723d5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_drivers"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libphidget22 \
    phidgets-accelerometer \
    phidgets-analog-inputs \
    phidgets-api \
    phidgets-digital-inputs \
    phidgets-digital-outputs \
    phidgets-gyroscope \
    phidgets-high-speed-encoder \
    phidgets-ik \
    phidgets-magnetometer \
    phidgets-motors \
    phidgets-msgs \
    phidgets-spatial \
    phidgets-temperature \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/noetic/phidgets_drivers/1.0.10-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/phidgets_drivers"
SRC_URI = "git://github.com/ros-drivers-gbp/phidgets_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "02225ff99db5c351c98f127eb4f331952063184a"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
