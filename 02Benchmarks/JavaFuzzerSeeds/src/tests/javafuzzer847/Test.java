package tests.javafuzzer847;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:53:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-46L;
    public static boolean bFld=false;
    public float fFld=2.42F;
    public static double dFld=0.24435;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        int i8=-44, i9=-24231, i11=4, i12=2, i13=150, i14=-48604, i15=28277;
        float f1=0.159F;
        long l1=-6306669193815634640L;

        i8 = 1;
        while (++i8 < 166) {
            i9 = 1;
            do {
                int i10=-99;
                i10 >>= i10;
                for (i11 = 1; i11 > 1; i11 -= 2) {
                    f1 += -296;
                    i12 = i9;
                    i10 = (int)l1;
                }
                i10 *= -16779;
                if (Test.bFld) continue;
            } while (++i9 < 10);
            i12 = -169;
        }
        for (i13 = 370; 22 < i13; i13 -= 3) {
            i15 = 1;
            while (++i15 < 13) {
                l1 += l1;
                i12 -= 18163;
                i14 += i11;
            }
        }
        long meth_res = i8 + i9 + i11 + i12 + Float.floatToIntBits(f1) + l1 + i13 + i14 + i15;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i6, int i7) {

        int i16=-14, i17=65063, i18=65251, i19=135, iArr1[]=new int[N];
        float f2=2.684F;

        FuzzerUtils.init(iArr1, -4);

        Test.bFld = (fMeth() <= i16);
        i16 |= i16;
        i17 = 233;
        while (--i17 > 0) {
            iArr1[i17 - 1] += (int)f2;
            i18 = 1;
            do {
                i19 = 1;
                do {
                    i6 = (int)Test.instanceCount;
                    switch (((i19 >>> 1) % 4) + 12) {
                    case 12:
                        i6 += (((i19 * f2) + i17) - i6);
                        break;
                    case 13:
                        i16 += (i19 * i19);
                        i16 <<= (int)Test.instanceCount;
                        switch ((i17 % 3) + 22) {
                        case 22:
                            i16 >>>= i18;
                            Test.instanceCount = i17;
                            break;
                        case 23:
                            i7 -= i18;
                            break;
                        case 24:
                            i7 = (int)Test.instanceCount;
                            break;
                        }
                    case 14:
                    case 15:
                        Test.instanceCount += i17;
                    }
                } while (++i19 < 1);
            } while (++i18 < 7);
        }
        vMeth1_check_sum += i6 + i7 + i16 + i17 + Float.floatToIntBits(f2) + i18 + i19 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i2=0, i3=-156, i4=2, i5=26052, iArr[]=new int[N];
        long l=-11403L;
        boolean b=true;
        float f=-29.295F;
        short s=7051, sArr[]=new short[N];

        FuzzerUtils.init(iArr, 57930);
        FuzzerUtils.init(sArr, (short)11497);

        i2 >>= (int)(i2 - (++Test.instanceCount));
        i2 = i2;
        i2 += i2;
        i2 -= (int)(iArr[(i2 >>> 1) % N] * ((Test.instanceCount--) - (++iArr[(8 >>> 1) % N])));
        for (l = 13; l < 209; ++l) {
            b = (Math.max((int)(8875241735793206620L - i3), (int)(Test.instanceCount - f)) != (--i2));
            for (i4 = 1; i4 < 8; ++i4) {
                try {
                    i5 = (i5 / -58);
                    i3 = (i4 / -1682509495);
                    iArr[(int)(l + 1)] = (-21951 / i5);
                } catch (ArithmeticException a_e) {}
                vMeth1(-51956, i3);
                i5 -= i3;
                sArr[(int)(l + 1)] += (short)i3;
                i5 += (i4 * i2);
                Test.instanceCount = i4;
                s = (short)i5;
                try {
                    i5 = (i3 / i4);
                    i3 = (i2 % i2);
                    i5 = (iArr[i4 + 1] / i3);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth_check_sum += i2 + l + i3 + (b ? 1 : 0) + Float.floatToIntBits(f) + i4 + i5 + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-61940, i1=34291, i20=54915, i21=-24, i22=-11, i23=61, i24=129, i25=-6, i26=0, i27=-8, i28=-53,
            iArr2[]=new int[N];
        float f3=-1.525F;
        short s1=-5483;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, 5726);
        FuzzerUtils.init(lArr, -180L);
        FuzzerUtils.init(bArr, true);

        for (i = 2; i < 217; i++) {
            vMeth();
            f3 = 1;
            do {
                Test.instanceCount += (long)(((f3 * i) + i1) - i);
                for (i20 = (int)(f3); 1 > i20; i20++) {
                    try {
                        i1 = (-100 % i);
                        i21 = (i1 % 548740834);
                        i1 = (-16111 % i20);
                    } catch (ArithmeticException a_e) {}
                }
                for (i22 = 1; i22 < 1; ++i22) {
                    iArr2 = iArr2;
                    fFld += (i22 + Test.instanceCount);
                }
                i1 += (int)f3;
                Test.instanceCount = i22;
                Test.dFld -= Test.dFld;
                Test.dFld = i22;
            } while (++f3 < 117);
            for (i24 = 7; i24 < 117; i24++) {
                i23 = 161;
            }
            for (i26 = 6; i26 < 117; i26++) {
                fFld += fFld;
                iArr2 = iArr2;
                i25 += (i26 ^ i21);
                fFld = -35645;
                i27 -= i22;
                i1 += (int)Test.dFld;
                i28 = 1;
                while (++i28 < 2) {
                    Test.instanceCount += (((i28 * i) + i) - fFld);
                    i21 = 47243;
                    lArr[i] = i21;
                    bArr = bArr;
                    i27 += i28;
                }
                s1 -= (short)9;
                i25 <<= i1;
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
