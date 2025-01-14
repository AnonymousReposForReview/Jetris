package tests.javafuzzer981;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:18:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static volatile float fFld=41.191F;
    public static volatile boolean bFld=false;
    public double dFld=2.117284;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i8=-57, i9=21, i10=-62440, i11=-40256, i12=-53157, iArr[]=new int[N];
        long l=2747479759L, lArr[]=new long[N];
        byte by=-109;

        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(lArr, -3988001766L);

        i8 *= (int)Test.fFld;
        for (i9 = 13; i9 < 269; i9++) {
            i11 = 1;
            do {
                if (i8 != 0) {
                    vMeth2_check_sum += i8 + i9 + i10 + i11 + l + i12 + by + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(lArr);
                    return;
                }
                if (i11 != 0) {
                    vMeth2_check_sum += i8 + i9 + i10 + i11 + l + i12 + by + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(lArr);
                    return;
                }
                Test.instanceCount += i10;
                iArr[i11 - 1] = i10;
                i10 += (int)Test.instanceCount;
                for (l = 1; l < 1; l++) {
                    i8 = i12;
                    i10 = (int)l;
                    i10 = (int)-16241L;
                }
            } while (++i11 < 6);
        }
        lArr[(i8 >>> 1) % N] -= i8;
        lArr[(i8 >>> 1) % N] *= i11;
        by <<= by;
        vMeth2_check_sum += i8 + i9 + i10 + i11 + l + i12 + by + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth1() {

        int i14=-32786, i15=0, i16=-6, i17=75, i18=-72, i19=-23500, iArr1[]=new int[N];
        byte by1=37;
        double d=33.94354;

        FuzzerUtils.init(iArr1, 7);

        if (Test.bFld) {
            vMeth2();
            for (i14 = 1; 150 > i14; ++i14) {
                for (i16 = 1; i16 < 11; i16++) {
                    for (i18 = i14; i18 < 2; ++i18) {
                        by1 >>= (byte)i15;
                        i15 >>= i16;
                        i17 ^= i18;
                        Test.instanceCount += (i18 + i17);
                        i19 = by1;
                        iArr1[i14 - 1] = (int)-94L;
                        i19 += (int)Test.fFld;
                        i15 -= -8974;
                    }
                    d -= 34391;
                    Test.instanceCount += (((i16 * i19) + Test.instanceCount) - i17);
                }
            }
        } else if (Test.bFld) {
            Test.instanceCount >>= 12;
        }
        vMeth1_check_sum += i14 + i15 + i16 + i17 + i18 + i19 + by1 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        int i5=1, i6=-11, i7=2, i20=-9458, i21=14, i22=65452, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 17838);

        i5 >>= (int)(1.19296 - (--i5));
        for (i6 = 13; i6 < 243; i6++) {
            vMeth1();
        }
        for (i20 = 2; i20 < 169; ++i20) {
            short s=-30169;
            s *= (short)i6;
            iArr2[i20] <<= i7;
            i7 = i5;
        }
        i22 = 1;
        do {
            dFld = i6;
            iArr2[i22 + 1] = i20;
        } while (++i22 < 190);
        Test.fFld -= Test.fFld;
        vMeth_check_sum += i5 + i6 + i7 + i20 + i21 + i22 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=54225, i1=-43212, i2=-7, i3=49661, i4=-1146, i23=-60885, iArr3[]=new int[N];
        byte by2=88;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr3, -14);
        FuzzerUtils.init(lArr1, 179L);

        i -= (int)(((i++) + (Test.instanceCount - i)) % -35063L);
        for (i1 = 11; 177 > i1; i1++) {
            for (i3 = 7; i3 < 151; ++i3) {
                i2 = Math.abs(i2);
                i2 = (int)(++Test.instanceCount);
                vMeth();
                i23 = 1;
                while (++i23 < 2) {
                    Test.instanceCount = i3;
                    i2 |= i23;
                    i2 += (((i23 * i4) + i23) - Test.fFld);
                    i2 += i23;
                    if (Test.bFld) {
                        i2 += (int)1.68F;
                        switch (((i1 % 4) * 5) + 91) {
                        case 97:
                            i2 -= by2;
                            Test.instanceCount = (long)dFld;
                            if (Test.bFld) continue;
                            i2 -= i4;
                            break;
                        case 102:
                            iArr3[i3] = -1;
                            i |= 38501;
                            Test.instanceCount += 34312;
                            i2 = i4;
                            break;
                        case 109:
                            i4 += i4;
                            i4 += i;
                            break;
                        case 95:
                            lArr1[i1 + 1] ^= i;
                            i2 *= (int)Test.fFld;
                            break;
                        }
                    } else {
                        i2 += (i23 * i23);
                        Test.instanceCount = i1;
                    }
                    if (Test.bFld) continue;
                    i2 += (i23 ^ i23);
                }
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
